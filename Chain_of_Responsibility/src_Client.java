public class Client {
    public static void main(String[] args) {
        Filter baseFilter = new SecurityFilter();
        Filter inputFilter = new InputFilter();
        Filter authenticationFilter = new Authentication();
        Filter authorizationFilter = new Authorization();

        baseFilter.setNext(inputFilter);
        inputFilter.setNext(authenticationFilter);
        authenticationFilter.setNext(authorizationFilter);

        Request request = new Request("A new User request.");

        //Tiến hành lọc input của người dùng.
        baseFilter.handle(request);
    }
}
