public class Authentication extends SecurityFilter {
    private void authenticateInput (Request request) throws IllegalArgumentException{
        //Kiểm tra xem nếu phát hiện request chưa được authenticate, nó sẽ ném exception ngay lập tức.
    }
    @Override
    public void handle(Request request) {
        authenticateInput(request);
        super.handle(request);
    }
}
