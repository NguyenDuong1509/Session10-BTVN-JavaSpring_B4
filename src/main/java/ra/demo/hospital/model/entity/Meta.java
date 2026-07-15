package ra.demo.hospital.model.entity;

public class Meta {
    private int totalRecords;
    private int currentPage;

    public Meta() {
    }

    public Meta(int totalRecords, int currentPage) {
        this.totalRecords = totalRecords;
        this.currentPage = currentPage;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
