package com.bold.task_manager

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class TaskAdapter(
    private var Task: ArrayList<Task>
) :RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){
    interface OnTaskClickListener {
        fun onTaskclick(position : Int, Task : Task, view : View)
    }


    var onTaskClickListener : OnTaskClickListener?=null


    inner class TaskViewHolder(view:View): RecyclerView.ViewHolder(view) {
        var project_id: TextView
        var project_name: TextView
        var due_Date: TextView
        var project_body: TextView
        var status: TextView

        init {
            project_name = view.findViewById(R.id.project_name)
            due_Date = view.findViewById(R.id.due_date)
            project_id = view.findViewById(R.id.project_id)
            project_body = view.findViewById(R.id.project_body)
            status = view.findViewById(R.id.Status)
            itemView.setOnClickListener {

                if (onTaskClickListener != null) {
                    onTaskClickListener!!.onTaskclick(
                        adapterPosition,
                        Task[adapterPosition],
                        it
                    )
                }

                /*Toast.makeText(
                   it.context,
                   "Message from: ${Task[adapterPosition]}",
                   Toast.LENGTH_SHORT
               ).show()*/

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.task_main, null)
        return TaskViewHolder(view)
    }

    override fun getItemCount()=Task.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.project_id.text = Task[position].Project_id.toString()
        holder.project_name.text = Task[position].Project_name
        holder.due_Date.text = Task[position].Due_Date
        holder.project_body.text = Task[position].Project_Body
        holder.status.text = Task[position].Status

    }
}