public interface IJobChain {
    // Setting the next job 
    public void setNextChain(IJobChain jobChain);

    /*
     Helps person to get the job
     1. Maang
     2. Product based 
     3. Service based 
     */
    public void getJob(Person person);
}
