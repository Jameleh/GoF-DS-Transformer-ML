package br.com.mferreira.factory;

public class Customer {
    private String gradeRequest;
    private Boolean hasCompanyContract;

    public Customer(String gradeRequest, Boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }

    public Boolean getHasCompanyContract() {
        return hasCompanyContract;
    }
}
