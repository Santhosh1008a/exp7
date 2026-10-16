package com.example.exp7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class DiscoveryAdapter(
    private val context: Context,
    private val items: List<DiscoveryItem>
) : BaseAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    private class ViewHolder(view: View) {
        val imageViewThumbnail: ImageView = view.findViewById(R.id.imageViewThumbnail)
        val textViewTitle: TextView = view.findViewById(R.id.textViewTitle)
        val textViewCategory: TextView = view.findViewById(R.id.textViewCategory)
        val textViewLocation: TextView = view.findViewById(R.id.textViewLocation)
        val textViewRating: TextView = view.findViewById(R.id.textViewRating)
        val textViewDescription: TextView = view.findViewById(R.id.textViewDescription)
    }

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): DiscoveryItem = items[position]

    override fun getItemId(position: Int): Long = items[position].id.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = inflater.inflate(R.layout.item_discovery, parent, false)
            holder = ViewHolder(view)
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as ViewHolder
        }

        val item = getItem(position)

        holder.imageViewThumbnail.setImageResource(item.imageResId)
        holder.textViewTitle.text = item.title
        holder.textViewCategory.text = item.category
        holder.textViewLocation.text = item.location
        holder.textViewRating.text = item.rating
        holder.textViewDescription.text = item.shortDescription

        return view
    }
}