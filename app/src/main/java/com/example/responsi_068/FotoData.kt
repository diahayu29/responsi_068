package com.example.responsi_068

object FotoData {
    private val fotoName = arrayOf(
        "Soekarno",
        "Soeharto",
        "Baharudin Yusuf Habibie",
        "Megawati Soekarno putri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )
    private val detail = arrayOf(
        "Soekarno adalah Presiden Pertama",
        "Soeharto adalah Presiden Kedua",
        "H.J Habibie adalah Presiden Ketiga",
        "Megawati adalah Presiden Keempat",
        "Susilo Bambang Yudhoyono adalah Presiden Kelima",
        "Joko Widodo adalah Presiden Keenam"
    )
    private val fotoPoster = intArrayOf(
        R.drawable.foto1,
        R.drawable.foto2,
        R.drawable.foto3,
        R.drawable.foto4,
        R.drawable.foto5,
        R.drawable.foto6
    )
    val listFoto: ArrayList<Foto>
        get() {
            val list = arrayListOf<Foto>()
            for (position in fotoName.indices) {
                val foto = Foto()
                foto.name = fotoName[position]
                foto.detail = detail[position]
                foto.poster = fotoPoster[position]
                list.add(foto)
            }
            return list
        }
}