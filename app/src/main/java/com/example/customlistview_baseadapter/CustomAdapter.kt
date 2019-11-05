package com.example.customlistview_baseadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class  CustomAdapter(private val context: Context, private val imageModelArrayList: ArrayList<ImageModel>) : BaseAdapter()
{
     override fun getViewTypeCount(): Int {
        return count
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getCount(): Int {
        return imageModelArrayList.size
    }

    override fun getItem(position: Int):Any {
        return imageModelArrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View
    {
        var convertView = convertView
        val holder: ViewHolder
        if (convertView == null) {
            holder = ViewHolder()
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.customlist_layout, null, true)
            //holder.tvname = convertView!!.findViewById(R.id.title) as TextView
            holder.tvcity = convertView!!.findViewById(R.id.description) as TextView
            holder.tvname=convertView.findViewById<TextView>(R.id.title)
            holder.iv = convertView.findViewById(R.id.icon) as ImageView

            convertView.tag = holder
        } else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = convertView.tag as ViewHolder
        }
          holder.tvname!!.setText(imageModelArrayList[position].name)
          holder.tvcity!!.setText(imageModelArrayList[position].city)
          holder.iv!!.setImageResource(imageModelArrayList[position].image_drawable)
          return convertView
        }
          private inner class ViewHolder
               {

                var tvname: TextView? = null
                var tvcity: TextView? = null
                // lateinit var tvname:TextView
               // lateinit var tvcity:TextView
                 internal var iv: ImageView? = null


         }

}
//1.Recycleview
//2.Listview:Done
//3.Explicit:Implicit with intent-DONE
//4.Spinner
//5.Bundle-DONE
//
//6.RadioButton-Done:Loaded
//7.Check box-Done:Loaded
//
//8.ArrayAdapter/BaseAdapter(Primary/sec)
//
//9. Contextmenu-Done
//10.PopUp menu -Done
//11.OptionMenu -Done
//
//12.AlertDiakog
//13.ViewPager
//14.Toast_CustomToastExample
//15.Autocomplete textview
//16.Edittext changelistner
//17.TabLayout in Kotlin
//18.
//19.
//20.
