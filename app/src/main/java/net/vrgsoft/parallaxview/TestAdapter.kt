package net.vrgsoft.parallaxview

import android.support.v7.widget.AppCompatImageView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class TestAdapter(private val backImages: List<Int>, private val frontImages: List<Int>) : RecyclerView.Adapter<TestHolder>() {

    override fun onBindViewHolder(holder: TestHolder, position: Int) {
        holder.ivImage.setImageResource(backImages[position])
        holder.ivImage2.setImageResource(frontImages[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolder =
            TestHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))


    override fun getItemCount(): Int = backImages.size
}


class TestHolder(root: View) : RecyclerView.ViewHolder(root) {
    var ivImage: AppCompatImageView = root.findViewById(R.id.ivImage)
    var ivImage2: AppCompatImageView = root.findViewById(R.id.ivImage2)
}