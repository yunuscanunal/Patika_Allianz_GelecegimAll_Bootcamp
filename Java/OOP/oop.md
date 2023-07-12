Lecture 1

# Sınıf ve Nesne Kavramları
## Nesne (Object) Nedir ?
Nesne tanımının TDK'da ki tanımına bir bakalım :

1. isim Belli bir ağırlığı ve hacmi, rengi olan her türlü cansız varlık, şey, obje.

2. isim, dil bilgisi Geçişli fiili bütünleyen yalın veya belirtme durumunda bulunan tümleç: Ali bir kitap almış cümlesinde kitap nesnedir.

3. isim, felsefe Öznenin dışında kalan her konu, obje: "Her nesne ve olaya alaycı bir gözle bakmak ilkesinden yola çıkar bu görüş." - Salâh Birsel

3. isim, felsefe Öznenin dışında kalan her konu, obje: "Her nesne ve olaya alaycı bir gözle bakmak ilkesinden yola çıkar bu görüş." - Salâh Birsel

### Nesnelere Örnekler
- Araba, telefon, elma, ördek, kalem gibi günlük hayatta kullandığımız eşyalar.

![Nesneler](../../img/nesneler.png 'Nesneler')

Bildiğimiz gibi her nesnenin kendine ait nitelikleri ve davranışları vardır. Nesneler birbirlerinden farklıdır ve kendi varoluşlarına göre davranırlar ve kendi kimliklerine sahiptirler.

__Nitelik__ : Nitelik kavramı, bir nesnenin özellikleridir ve nesnenin mevcut durumunu tanımlar. Mesela bir ördeğin rengi ve ağırlığı o ördeğin nitelikleridir. Bir ördeğimiz rengi siyah, diğer ördeğimizin rengi beyazdır. Bu durumda her iki nesne (yani ördek) nitelikleri sebebi ile birbirilerinden bağımsızdırlar.

__Davranış__ : Bir nesnenin kendine özel yaptığı eylemlerdir. Yine ördek örneğine bakarsak, bir ördek uçabiliyorken diğer bir ördek fiziksel durumu gereği uçamayabilir.

Nesneler hakkında bilmemiz gereken bir diğer husus ise, nesneler bir isimdir. Nesnelerin kendilerine ait nitelik ve davranışları vardır.

## Sınıf (Class) Nedir ?
NYP sınıflar ve nesneler üzerine kurulmuştur, "Sınıflar" bir problemi soyutlamak ve genelleştirmek için kullanılan yapılardır veya kılavuzlardır. Sınıflar, bir nesneye ait tüm özellikleri temsil eder. Bu özellikler nesnenin ne tür nitelikleri ve davranışları olacağını belirler.

Mesela "Araba" bir sınıftır. Arabalara ait nitelikler renk, hız, vites sayısı, yakıt türü vb. bir sürü nitelik olabilir. Ayrıca bazı arabalara özel davranışlar olabilir, park sensörü, oto pilot, hız sabitleme gibi arabaların kendilerine özel davranışları da olabilir. Bir araba üretilirken, bir yapım kılavuzuna ihtiyaç vardır. Programlama da bu kılavuzlara "Sınıf (Class)" denir.

![Araba](../../img/car.png 'Arabalar')

---
Lecture 2

# Nesne Yönelimli Programlama Nedir ?
Nesne Yönelimli Programlama (Object Oriented Programming), sınıflar ve nesneler kavramına dayanan bir programlama yaklaşımıdır. Bu yaklaşımın amacı, ihtiyaç duyulan programı daha küçük parçalara bölerek, yönetilebilir ve yeniden kullanılabilir hale getirmektir. Her küçük parçanın kendine ait özelliği, verileri ve diğer küçük parçalarla nasıl iletişim kuracağı bilgileri bulunur.

NYP’de programlar, nesnelerin birbirileriyle etkileşime geçmeleri sağlanmasıyla tasarlanır. Bizler gerçek hayattaki karmaşıklığı bir şekilde modelleyerek bunu bilgisayarın anlamasını sağlamaktayız. Modelleme, insanın problem çözmek üzere eskiden beri kullandığı bir yöntemdir. Büyükçe bir problemin tamamını zihinde canlandırıp çözmeye çalışmak yerine, oluşturulacak model ya da modeller üzerinde hedef sistemin görünüşü, davranışı ya da bazı durumlarda verdiği tepkiler gözlemlenebilir.

Nesne Yönelimli Programlama ile bizler yapacağımız her şeyi bilgisayarın anlayacağı şekilde modelleyip, “nesne” halinde aktarıyoruz. Böylelikle gerçek hayatta bizim için geçerli olan nesneleri artık bilgisayarların anlayacağı hale getirmiş oluyoruz. Tabi ki kullanılan programlama dilinin bizlere verdiği imkanlar dahilinde. Böylelikle kodlayan kişi ile bilgisayar arasında dilden bağımsız bir anlaşma, bir felsefe ortaya çıkmış oluyor. Artık bizim için “araba” nesnesi ne anlama geliyorsa, bilgisayar için de aynı anlama geliyor.

# Neden Nesne Yönelimli Programlama ?
- NYP, hızlı ve uygulaması kolay bir yaklaşımdır.
- NYP, programlar için net bir yapı sağlar.
- NYP, "Don't Repeat Yourself" yani "Kendini Tekrar Etme" ilkesini uygular ve kodun bakımını, düzenlenmesini ve hata ayıklamasını kolaylaştırır.
- NYP, daha az kod ve daha kısa geliştirme süresiyle, yeniden kullanılabilir uygulamalar oluşturmayı mümkün kılar.
- NYP, yapıya daha sonradan yeni özellikler ekleyerek genişletilebilirlik sağlar.
- NYP, problemleri gerçek hayattaki işlemlere göre modeller.

---
Lecture 3

# Modelleme ve Soyut Düşünme
Gerçek hayattaki problemleri bilgisayarın sanal ortamında çözebilmek için, ilk önce problemin uygun şekilde bilgisayar ortamına aktarılması gerekmektedir. Bu işlem “soyutlama (abstraction)” ya da “modelleme (modeling)” olarak anılır.

Modelleme, insanın problem çözmek üzere eskiden beri kullandığı bir yöntemdir. Büyükçe bir problemin tamamını zihinde canlandırıp çözmeye çalışmak yerine, oluşturulacak model ya da modeller üzerinde hedef sistemin görünüşü, davranışı ya da bazı durumlarda verdiği tepkiler gözlemlenebilir.

Model, var olan ya da gerçekleştirilmesi planlanan bir sistemi anlamak ya da anlatmak üzere oluşturulabilir ve birçok farklı alanda etkili bir şekilde kullanılmaktadır. Örneğin, bir toplu konut inşaatını müşterilerine tanıtmak isteyen bir inşaat firması, binaların yerleşimlerini, renk ve göreli büyüklüklerini görsel olarak ifade eden maket ya da maketler hazırlar. Bu maketi inceleyen bir kimse, almak istediği konutun nerede olduğunu, okul binasına yakınlığını ya da anayola ulaşımın nasıl olduğunu görerek değerlendirebilir. Burada model makettir ve “hedef sistemi anlatmak” amacını yerine getirmektedir.

![Vertex](../../img/Vertex_BD_005.jpg 'Vertex')

Bir sistemle ilgili birden çok model oluşturulabilir. Tek bir model ile sistemin tamamını görmeye çalışmak yerine, üzerinde çalışılan sistemin farklı yönlerini öne çıkaran modeller hazırlanabilir. Örneğin inşaat firması toplu konutu müşterilere anlatmak üzere estetik tasarımı ön plana çıkan bir maket hazırlarken, bu toplu konut projesindeki binaların elektrik tesisatı için farklı, su tesisatı için farklı, genel daire görünümü için farklı projeler hazırlar. Böylece aynı sistemin farklı yönleriyle ilgilenen kimseler, yalnızca kendilerini ilgilendiren yönü öne çıkaran model üzerinde çalışma olanağı bulurlar.

Modelin mutlaka elle tutulur olması da gerekmez. Bilgisayar benzetimi ile de çeşitli modeller oluşturulabilir. Örneğin bir uçağın havadaki hareketini incelemek üzere geliştirilmiş bir bilgisayar benzetimi ile uçak modellenebilir. Kanat uzunluğu ya da gövde eğimi gibi parametrelerle oynanarak uçağın farklı hava koşullarında nasıl davranacağı anlaşılmaya çalışılabilir. Burada, sistemin davranışını anlamak amacıyla, sanal ortamda oluşturulmuş bir model söz konusudur.

![Model](../../img/model.jpg 'Model')

---
