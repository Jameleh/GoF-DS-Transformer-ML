public class Authorization extends SecurityFilter {
    private void authorizeInput (Request request) throws IllegalArgumentException{
        //Kiểm tra xem nếu phát hiện người dùng không đủ quyền, nó sẽ ném exception ngay lập tức.
    }
    @Override
    public void handle(Request request) {
        authorizeInput(request);
        super.handle(request);
    }
}
