package Homeworks.Homework2.assets;

public class Platform {

    /*
     * Film objemizde platform alanını obje olarak alabilmek için "Platform" sınıfı
     * oluşturuldu.
     * "platformName" isminde platform adı için değişken tanımlandı. Private olduğu
     * için erişim sağlayabilmek için
     * Getter ve Setter methodları eklendi. Son olarak film bilgileri yazdırılırken
     * obje referansı almamak adına
     * "toString" methodu override edildi.
     */

    private String platformName;

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    @Override
    public String toString() {
        return platformName;
    }
}