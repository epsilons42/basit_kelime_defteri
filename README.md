# basit_kelime_defteri
SQLite ile yazılmış basit kelime defteri.
Kelime defterinde pek fazla tasarım kullanmadım,
İlk girildiğinde kısa süre splash ekran ortaya çıkıyor
Bu ekrana proje ismi reklam koyulabilir. Splash süresi dolunca main aktiviteye geçiş yapıyor,
Ekleme butonuna basıldığında kayıt yerine götürülüyor kayıt SQLite datasına bağlı
Yazdığımız her kayıt dataya aktarılıp ana sayfada RecyclerView sayesinde listeleniyor.
SQLite kısmında kayıtta yazma RecyclerView'da okuma kullanılmıştır basit olduğu için silme veya güncelleme kısmını eklemedim.
