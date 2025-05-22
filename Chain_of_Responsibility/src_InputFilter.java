public class InputFilter extends SecurityFilter {
    private void processInput (Request request) throws IllegalArgumentException{
        //Kiểm tra xem nếu phát hiện request không hợp lệ, nó sẽ ném ra một exception và dừng chuỗi kiểm tra ngay lập tức.
    }
    @Override
    public void handle(Request request) {
        processInput(request);
        super.handle(request);
    }
}
