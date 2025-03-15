# Sistem Komputer

Sistem ini merupakan implementasi untuk representasi objek komputer beserta komponennya. Pemrograman ini menggunakan konsep pemrograman berorientasi objek (OOP) dengan memanfaatkan inheritance (pewarisan) dan composition (komposisi).

## Struktur Kelas

![Image](https://github.com/user-attachments/assets/1f5e4211-1b84-4ecc-9378-34aa0358fc57)

**Kelas Dasar**

**1. Komponen**

- Kelas dasar untuk semua komponen komputer
- Memiliki atribut merk dan nama
- Digunakan sebagai parent class oleh CPU, RAM, Harddrive, dan GraphicsCard
    
**2. ElektronikDevice**

- Kelas dasar untuk perangkat elektronik
- Memiliki atribut konsumsi daya dalam watt
- Digunakan sebagai parent class oleh CPU, Harddrive, dan GraphicsCard

**Kelas Komponen**

**1. Cpu**

- Mewarisi dari Komponen dan ElektronikDevice (multiple inheritance)
- Menyimpan informasi jumlah core, kecepatan GHz, dan tipe socket

**2. Ram**

- Mewarisi dari Komponen
- Menyimpan informasi kapasitas GB dan tipe DDR

**3. Harddrive**

- Mewarisi dari Komponen dan ElektronikDevice
- Menyimpan informasi kapasitas GB, tipe drive, dan kecepatan MB/s

**4. GraphicsCard**

- Mewarisi dari Komponen dan ElektronikDevice
- Menyimpan informasi VRAM GB dan model GPU

**Kelas Utama**

**1. Komputer**
- Kelas utama yang mengkomposisi semua komponen
- Memiliki nama, CPU, daftar RAM, Harddrive, dan GPU
- Dapat menambahkan RAM baru dengan metode add_ram()

## Fitur Program

**1. Multiple Inheritance**

- Sistem ini mendemonstrasikan penggunaan multiple inheritance
- Beberapa kelas mewarisi dari dua kelas induk sekaligus
    
**2. Encapsulation**

- Semua atribut dienkapsulasi
- Atribut hanya dapat diakses melalui getter dan setter

**3. Composition**

- Kelas Komputer menggunakan komposisi untuk menggabungkan berbagai komponen

**4. Information Hiding**

- Implementasi menyembunyikan detail internal dan hanya mengekspos metode-metode yang diperlukan

## Output Program

Program ini akan menampilkan informasi komputer dengan detail berikut:

- Nama komputer
- Spesifikasi CPU (merk, nama, jumlah core, kecepatan, socket, konsumsi daya)
- Spesifikasi RAM (jumlah RAM terpasang, detail tiap RAM, dan total kapasitas)
- Spesifikasi Storage (merk, nama, kapasitas, tipe, kecepatan, konsumsi daya)
- Spesifikasi GPU (merk, nama, model, VRAM, konsumsi daya)
- Total konsumsi daya sistem

![Image](https://github.com/user-attachments/assets/5367aebe-2214-4653-9b6a-d64877254363)
