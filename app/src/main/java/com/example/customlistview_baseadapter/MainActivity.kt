package com.example.customlistview_baseadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    private var customeAdapter: CustomAdapter? = null
    private var imageModelArrayList: ArrayList<ImageModel>? = null


    private val myImageList = intArrayOf(R.drawable.img1, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background)
       private val myImageNameList = arrayOf("Benz", "Bike", "Car", "Carrera", "Ferrari", "Harly", "Lamborghini", "Silver")
       private val MycityList= arrayOf("A rose is a woody perennial flowering plant of the genus Rosa, in the family Rosaceae, or the flower it bears. There are over a hundred species and thousands of cultivars",
           "Nelumbo nucifera, also known as Indian lotus, sacred lotus, bean of India, Egyptian bean or simply lotus, is one of two extant species of aquatic plant in the family Nelumbonaceae",
           "Cherry Blossom\",R.drawable.nelumbo,\"A cherry blossom (or commonly known in Japan as sakura) is the flower of any of several trees of genus Prunus, particularly the Japanese cherry, Prunus serrulata",
           "Cherry Blossom\",R.drawable.nelumbo,\"A cherry blossom (or commonly known in Japan as sakura) is the flower of any of several trees of genus Prunus, particularly the Japanese cherry, Prunus serrulata",
           "Cherry Blossom\",R.drawable.nelumbo,\"A cherry blossom (or commonly known in Japan as sakura) is the flower of any of several trees of genus Prunus, particularly the Japanese cherry, Prunus serrulata",
           "Cherry Blossom\",R.drawable.nelumbo,\"A cherry blossom (or commonly known in Japan as sakura) is the flower of any of several trees of genus Prunus, particularly the Japanese cherry, Prunus serrulata",
           "Cherry Blossom\",R.drawable.nelumbo,\"A cherry blossom (or commonly known in Japan as sakura) is the flower of any of several trees of genus Prunus, particularly the Japanese cherry, Prunus serrulata",
           "Cherry Blossom\",R.drawable.nelumbo,\"A cherry blossom (or commonly known in Japan as sakura) is the flower of any of several trees of genus Prunus, particularly the Japanese cherry, Prunus serrulata")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageModelArrayList = populateList()

        Log.d("hjhjh", imageModelArrayList!!.size.toString() + "")

         customeAdapter = CustomAdapter(this, imageModelArrayList!!)
         list!!.adapter = customeAdapter
    }


     private fun populateList():ArrayList<ImageModel>
     {
        val list = ArrayList<ImageModel>()
        for (i in 0..7) {
        val imageModel = ImageModel()
        imageModel.name= myImageNameList[i]
        //imageModel.image_drawable=myImageList[i]
        imageModel.city = MycityList[i]
        imageModel.image_drawable =myImageList[i]
        //  imageModel.setCity(MycityList[i])
         list.add(imageModel)
    }
         return list
}

}
