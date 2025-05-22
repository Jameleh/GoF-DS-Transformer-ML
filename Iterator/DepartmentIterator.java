/* 413226087 李柏翰 */
/* 413085043 謝慶章 */

public class DepartmentIterator implements IIterator {
    private String[] departments;
    private int index = 0;

    public DepartmentIterator(String[] departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        return index < departments.length && departments[index] != null;
    }

    public String next() {
        if (hasNext()) {
            return departments[index++];
        }
        else {
            return null;
        }
    }
}
