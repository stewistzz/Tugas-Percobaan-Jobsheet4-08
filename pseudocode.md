	Pseudocode
Algoritma : Harga_Bayar_08

Deklarasi :
harga, jumlah, jmlHalBuku				: int
merkBuku						: String
diskon , total, bayar, jmlDiskon			: double

Deskripsi : 
1.	Print “Masukkan merek buku anda”
2.	read merkBuku
3.	Print “jumlah halaman buku anda”
4.	read jmlHalBuku
5.	print “Masukkan harga barang yang dibeli”
6.	read harga
7.	print “Masukkan jumlah barang yang dibeli”
8.	read jumlah
9.	print “Besar diskon yang anda dapatkan”
10.	read diskon
11.	total = harga * jumlah
12.	jmlDiskon = total * diskon / 100
13.	bayar = total – jmlDiskon
14.	print “Merek buku Anda”
15.	print merkBuku
16.	print “Jumlah halaman buku anda”
17.	print jmlHalBuku
18.	print “Harga total sebelum diskon”
19.	print total
20.	print “Diskon yang anda dapatkan adalah”
21.	print jmlDiskon
22.	print”jumlah yang harus dibayar adalah”
23.	print bayar
