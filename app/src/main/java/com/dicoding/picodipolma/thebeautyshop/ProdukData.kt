package com.dicoding.picodipolma.thebeautyshop

object ProdukData {
    private val produkName = arrayOf("WARDAH Everyday Luminous Compact Powder",
        "Garnier Micellar Water Pink 400ml",
        "Viva Cosmetics Milk Cleanser 100ml",
        "Some by Mi AHA BHA PHA 30 Days Miracle Serum",
        "SOME BY MI Niacin 30Days Miracle Brightening Sleeping Mask 60g",
        "Nivea Body Lotion White Serum Spf 25 70ml",
        "Some by Mi Snail Truecica Miracle Repair Serum",
        "MAKE OVER MAKE OVER Powerstay Demi-Matte Cover Cushion N30 Natural Beige",
        "MAKE OVER Intense Matte Lip Cream",
        "MAKE OVER Eye Shadow Palette 10gr")

    private val produkHarga = arrayOf(
            "Rp34.400",
            "Rp110.000",
            "Rp9.000",
            "Rp245.000",
            "Rp175.000",
            "Rp23.200",
            "Rp150.000",
            "Rp145.000",
            "Rp105.000",
            "Rp 146.250")

//
    private val produkDetails = arrayOf("Everyday Luminous Compact Powder produk dari Wardah ini merupakan Bedak padat yang mengandung micro coated particle untuk menghasilkan make up halus, natural dan tahan lama. Ringan dan nyaman digunakan sepanjang hari. Meratakan warna kulit dan menyamarkan noda di wajah. Mengandung Vit.E sebagai antiokdsidan",
        "Produk pembersih wajah yang dapat menghapus makeup, membersihkan wajah dari debu dan polusi serta memberikan efek segar setelah dipakai Untuk menggunakannya bisa dituang ke kapas lalu diusap dengan lembut di wajah, dan tidak perlu digosok. Tidak perlu dibilas, namun tetap disarankan untuk menggunakan sabun pencuci wajah setelahnya. Tidak meninggalkan rasa perih di mata dan rasa pahit di bibir Product Compatibility: Cocok untuk kulit normal cenderung sensitif",
        "Untuk membersihkan wajah dari sisa make-up dengan Viva Cosmetics Milk Cleanser. Cocok untuk kulit normal atau kering dan aman digunakan sehari-hari.",
        "It is benificial for soothing the skin Centella Asiatica Extract of 14.5% and Melaleuca Alternifolia (Tea Tree) Lead water 10,000ppm is included and skin turnovers with smooth skin texture is possible as AHA,BHA,PHA Compenents which removes the dead cell.",
        "Goheung Yuja (citron) extract 70% → Rich in nutrients and moisture, Citron extracts increase moisture levels and delivers skin-smoothing Niacinamide 5% → Contains 5% of skin lightening ingredient to boost brightening effect Glutathione / Arbutin → Help to design radiant, petal-soft, smooth skin 10 types of vitamin → Soothe your stressed-out skin from external stimulus Yuja(citron) Peel Oil",
        "Nivea UV Extra Body Whitening Body Serum [70mL] adalah body serum yang dapat mencerahkan dan melembutkan kulit sehingga kulit Anda tampak lebih cerah merata hanya dalam waktu 14 hari serta kulit tidak mudah menjadi gelap dan kusam akibat efek negatif sinar matahari. Diperkaya vitamin C untuk mencerahkan kulit dan bertindak sebagai antioksidan, SPF 25 PA++ memberikan perlindungan optimal bagi kulit dari efek negatif sinar UVA dan UVB dengan teknologi hydra IQ dan red seaweed mengembalikan & melengkapi kelembaban yang hilang dengan menjaganya selama lebih dari 24 jam. Serum ini mengandung licorice untuk kulit tampak lebih cerah, diformulasikan ringan, tidak lengket, dan cepat meresap sampai lapisan terdalam epidermis.",
         "Benefits A dual functional product: Whitening + Anti-wrinkle Contains 890,000ppm of Snail Truecica which consists of Black Snail Extract and Truecica Helps for skin regeneration to repair skin damage with Black Snail Extract Soothes skin and reinforces skin barrier with Truecica Removes blemishes and scar with a non-sticky finish Free of 20 harmful ingredients. Passes skin irritation test.",
        "Make Over Powerstay Demi-Matte Cover Cushion merupakan cushion compactyang tahan lamahingga 12 jam,cocok untuk wanita yang aktif di ruangan ber-AC dan outdoor, dengan medium hingga full coverage dan tampilan matte berdimensi yang natural.Tersedia dalam 6 varian warna yang cocok dengan tone kulitIndonesia, serta dilengkapi dengan anti pollution dan UV filter SPF 50/PA++++ untuk melindungi wajah selama aktivitas seharian. Diformulasikan dengan pelembab, oil control dan soft focus agent untuk tampilan kulit tampak sehat, halus dan mulus yang tahan sepanjang hari. Dilengkapi dengan aplikator puff anti bakterial yang tahan air, sehinggaproduk tidak terserap di puff dan mampu memberikan coverage maksimal di wajah.",
        "Make Over Intense Matte Lip Cream adalah lip cream dengan bentuk liquid persembahan dari Make Over yang menghadirkan warna-warna intens dan menawan. Kini, Make Over Intense Matte Lip Cream memiliki koleksi 20 varian warna yang menarik dan lengkap, mulai dari warna-warna nudes hingga warna-warna bold yang sangat menawan. Diformulasi dengan tekstur creamy sehingga lip cream ini sangat mudah diaplikasikan. Kandungan pigmentasi warnanya yang sangat intens dapat mengcover bibir hanya dengan sekali olas. Hasil akhirnya pun matte dan terasa sangat ringan yang bahkan dapat bertahan hingga lebih dari 8 jam.",
        "Pancarkan kecantikan memukau pada mata Anda dengan menggunakan Make Over Eye Shadow Palette Nudes (10 gr). Eye Shadow Palette 10 gr dari Make Over ini merupakan pewarna untuk kelopak mata Anda. Eye shadow ini hadir dengan 8 warna cantik yang mudah dibaurkan, membuat kelopak mata Anda akan terlihat semakin mempesona dan menawan Tone warna nude, cocok untuk riasan mata simple Formula halus dan lembut Warna eye shadow pigmented Cara Penggunaan Aplikasikan Pada Kelopak mata secara menyeluruh, bisa dengan 1 warna saja atau dengan tampilan ombre."
        )

    private val produkImages = intArrayOf(R.drawable.photo_13,
        R.drawable.photo_22,
        R.drawable.photo_20,
        R.drawable.photo_14,
        R.drawable.photo_15,
        R.drawable.photo_21,
        R.drawable.photo_16,
        R.drawable.photo_17,
        R.drawable.photo_18,
        R.drawable.photo_19)


    val listData: ArrayList<Produk>
        get() {
            val list = arrayListOf<Produk>()
            for (position in produkName.indices){
                val produk = Produk()
                produk.name = produkName[position]
                produk.harga = produkHarga[position]
                produk.detail = produkDetails[position]
                produk.photo = produkImages[position]
                list.add(produk)
            }
            return list
        }

}
