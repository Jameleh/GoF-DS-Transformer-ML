public class ServiceBased implements IJobChain{
    private IJobChain jobChain;
    @Override
    // This method is being used for setting next job.
    public void setNextChain(IJobChain jobChain){
        this.jobChain=jobChain;
    }
    @Override
    // This method is being used for getting the job.
    public void getJob(Person person){
        if(person.getSkillType().equals("Service Based")){
            System.out.println("Got selected in the MAang");
        }
        else{
            System.out.println("Got rejected in the Service based");
            System.out.println("You need to practice more..");
            
        }
    }
}
