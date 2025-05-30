package com.algaworks;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import com.algaworks.listeners.Listener;
import com.algaworks.notificador.Notificador;
import com.algaworks.notificador.NotificadorLancamentosVencidos;
import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

import com.algaworks.job.LancamentosVencidosJob;
import com.algaworks.repository.Lancamentos;
import com.algaworks.listeners.EmailListener;
import com.algaworks.listeners.SMSListener;

public class Principal {

	public static void main(String[] args) throws Exception {
		Notificador notificador = new NotificadorLancamentosVencidos();

		Listener enviadorEmail = new EmailListener(notificador);
		Listener enviadorSms = new SMSListener(notificador);

		Lancamentos lancamentos = new Lancamentos();

		JobDataMap jobDataMap = new JobDataMap();

		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		
		jobDataMap.put("lancamentos", lancamentos);
		jobDataMap.put("notificador", notificador);
		
		JobDetail job = newJob(LancamentosVencidosJob.class)
						.setJobData(jobDataMap)
						.withIdentity("lancamentosVencidosJob", "lancamentosVencidosGroup")
						.build();

		CronTrigger trigger = newTrigger()
				.withIdentity("trigger1", "group1")
				.withSchedule(cronSchedule("0 * * * * ?"))
		        .build();

		scheduler.scheduleJob(job, trigger);

		scheduler.start();

		Thread.sleep(220000);

		scheduler.shutdown(true);
	}

}
