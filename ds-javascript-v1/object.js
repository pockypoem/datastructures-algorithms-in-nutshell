//object literal
//bisa menampung berbagai jenis tipe data dan struktur data
// dapat menampung fungsi juga
//key-value store
let fruit = {
    name: 'grape', 
    description: 'Popular and famous fruit.', 
    colors: ['purple', 'green'], 
    isSmall: true, 
    order: 1,
    owner: 'me'
};

console.log(fruit['order']);
console.log(fruit.description);
//kalau owner tidak ada maka akan mencetak Jimmy
console.log(fruit.owner || 'Jimmy');

//Struktur data object ini tidak memiliki mekanisme pencarian
//Kita harus melakukan konversi object menjadi array baru kemudian kita cari.

//Ada beberapa cara konversi object jadi array:
let keys = Object.keys(fruit);
console.log(keys);
let values = Object.values(fruit);
console.log(values);

//entries: akan membuat object jadi array yang berpasangan
let entries = Object.entries(fruit);
console.log(entries);

///menambahkan nilai yang baru ke dalam object
//bisa mendefinisikan banyak key dan values sekaligus
//Object.defineProperties();
//hanya bisa mendefinisikan 1 saja untuk sekali eksekusi
//Object.defineProperty();

fruit.price = 25000;
console.log(fruit);

//mengubah harga
fruit.price = 35000;
console.log(fruit);

//menghapus nilai dalam sebuah object
delete fruit.price;
console.log(fruit);