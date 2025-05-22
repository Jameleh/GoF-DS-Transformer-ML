public class ProductBased implements IJobChain{
    private IJobChain jobChain;
    @Override
    // This method is being used for setting next job.
    public void setNextChain(IJobChain jobChain){
        this.jobChain=jobChain;
    }
    @Override
    // This method is being used for getting the job.
    public void getJob(Person person){
        if(person.getSkillType().equals("Product")){
            System.out.println("Got selected in the Product");
        }
        else{
            System.out.println("Got rejected in the product based");
            System.out.println("Applying for the product based company");
            this.jobChain.getJob(person);
        }
    }
}
