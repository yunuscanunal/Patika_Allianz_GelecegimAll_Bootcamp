package Homeworks.Homework2.assets;

public class Category {

    /*
     * Film objemizde kategori alanını obje olarak alabilmek için "Category" sınıfı
     * oluşturuldu.
     * "categoryName" isminde kategori adı için değişken tanımlandı. Private olduğu
     * için erişim sağlayabilmek için
     * Getter ve Setter methodları eklendi. Son olarak film bilgileri yazdırılırken
     * obje referansı almamak adına
     * "toString" methodu override edildi.
     */

    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return categoryName;
    }
}