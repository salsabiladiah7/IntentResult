# IntentResult
> Pada saat menjalankan Intent atau perpindahan halaman pasti dilakukan pemanggilan suatu activity lain. Memanggil 'activity' yang lain tidaklah selalu satu arah. Kita juga bisa memanggil 'activity' yang lain tersebut dan menerima hasilnya kembali. Untuk menerima hasilnya, kita memanggil 'startActivityForResult()' (sebagai pengganti 'startActivity()'). Tentu 'activity' yang akan dipanggil dan merespon harus di-desain untuk mengembalikan hasilnya. Ketika 'activity' tersebut merespon, dia akan mengirim hasilnya sebagai object 'Intent' yang lain. 'Activity' kita menerimanya di dalam method 'onActivityResult()'. [Learn more...](https://www.jodemy.com/2016/10/menerimamenangkap-hasil-dari-activity.html)

> Selain melewatkan parameter object 'Intent', kita juga perlu melewatkan parameter 'request code'. Request code ini sederhananya adalah suatu nilai integer yang mengidentifikasi activity yang kita panggil. Kode ini diperlukan karena bila suatu activity mengembalikan suatu nilai, kita harus punya cara untuk mengidentifikasinya. Misalnya, kita mungkin memanggil banyak activity pada saat yang sama, dan beberapa activity mungkin tidak merespon dengan segera (misalnya menunggu jawaban dari suatu server). Bila activity merespon, kita perlu request code tersebut untuk menentukan activity mana yang merespon ini. [Learn more...](https://www.jodemy.com/2017/02/mengembalikan-hasil-dari-suatu-intent.html)

### Hasil Program
![ezgif-2-802247a68ab0](https://user-images.githubusercontent.com/60590053/109178001-f8662c00-77ba-11eb-98b5-5bedda35f2df.gif)

- Sebelum Edit Data

![WhatsApp Image 2021-02-25 at 22 27 24](https://user-images.githubusercontent.com/60590053/109177026-f8b1f780-77b9-11eb-95ad-dec99a2b570f.jpeg)

- Saat Mengedit Data


![WhatsApp Image 2021-02-25 at 22 27 23 (1)](https://user-images.githubusercontent.com/60590053/109177042-fbace800-77b9-11eb-98d5-d7444675bf53.jpeg)

- Setelah Data di Save

![WhatsApp Image 2021-02-25 at 22 27 23](https://user-images.githubusercontent.com/60590053/109177037-fa7bbb00-77b9-11eb-974b-39fe8aa87799.jpeg)


## Terimakasih
