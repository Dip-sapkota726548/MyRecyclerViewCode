package com.dip.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dip.recycleview.R
import com.dip.recycleview.model.Actor
import de.hdodenhof.circleimageview.CircleImageView
import org.w3c.dom.Text

class ActorAdapter(
    val lstActor : ArrayList<Actor>,
    val  context : Context
) :
    RecyclerView.Adapter<ActorAdapter.ActorViewHolder>() {

    class ActorViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imgProfile: CircleImageView
        val tvName : TextView
        val tvAddress : TextView
        val tvSalary: TextView

        init {
            imgProfile = view.findViewById(R.id.imgProfile)
            tvName = view.findViewById(R.id.tvName)
            tvAddress = view.findViewById(R.id.tvAddress)
            tvSalary = view.findViewById(R.id.tvSalary)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.mero_actor_layout,parent, false)
        return  ActorViewHolder(view)
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val actor = lstActor[position]
        holder.tvName.text = actor.actorName
        holder.tvAddress.text = actor.actorAddress
        holder.tvSalary.text = actor.actorSalary.toString()

        Glide.with(context)
            .load(actor.actorImageURL)
            .into(holder.imgProfile)
    }

    override fun getItemCount(): Int {
        return lstActor.size
    }
}