# En Büyük Ortak Bölen (EBOB) Hesaplama Uygulaması

Bu uygulama, Java ile yazılmış bir En Büyük Ortak Bölen (EBOB) hesaplama programıdır. Kullanıcıdan alınan iki sayının EBOB'unu hesaplar ve sonucu ekrana yazdırır.

## Özellikler

- **EBOB Hesaplama:** Kullanıcıdan alınan iki sayının en büyük ortak bölenini bulur.

## Gereksinimler

- **Java 8** veya daha yeni bir sürüm

## Kurulum

1. Projeyi bilgisayarınıza klonlayın veya `EBOB.java` dosyasını indirin.
2. Terminalde Java dosyasını derlemek için:

    ```bash
    javac EBOB.java
    ```

3. Uygulamayı çalıştırmak için:

    ```bash
    java EBOB
    ```

## Kullanım

1. Uygulama çalıştırıldığında iki tam sayı girmeniz istenir.
2. Program, girilen iki sayının EBOB'unu hesaplar ve sonucu ekrana yazdırır.

## Kod Hakkında

- **EBOB Hesaplama Fonksiyonu:** `bulEBOB` fonksiyonu, kullanıcı tarafından girilen iki tam sayı arasında en büyük ortak böleni hesaplamak için **Çıkarma Yöntemi** (ya da Öklid algoritmasının bir varyantı) kullanır. Bu yöntemde, sayıların birbirinden çıkarılmasıyla EBOB değeri bulunur:
  - `sayi1` ve `sayi2` eşit olana kadar döngü devam eder.
  - Döngü sonunda `sayi1` (veya `sayi2`) değeri EBOB'u temsil eder.

## Katkıda Bulunma

Bu proje geliştirmeye açıktır. Katkıda bulunmak isterseniz:
1. Projeyi çatallayın.
2. Değişikliklerinizi yapın.
3. Bir çekme isteği gönderin.

## Lisans

Bu proje açık kaynak bir projedir ve herhangi bir lisans altında yayınlanmamıştır.
