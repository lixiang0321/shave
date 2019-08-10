package net.shavedog.api.util;

public class PageUtils {
    private int page;
    private int size;



    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "PageUtils{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }

    public void setSize(int size) {

        this.size = size;
    }
}
