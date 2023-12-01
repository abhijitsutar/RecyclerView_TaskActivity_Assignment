package com.bold.task_manager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerTask:RecyclerView
    private lateinit var taskAdapter:TaskAdapter
    private var Task= ArrayList<Task>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerTask=findViewById(R.id.recycler)

        initTask()
        taskAdapter= TaskAdapter(Task)
        recyclerTask.adapter=taskAdapter

        recyclerTask.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


    }
    private fun initTask(){
        Task.add(Task(1,"Project Title : Job Portal","Due Date : 30-12-202","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(2,"Project Title : GateSec","Due Date : 30-12-2023","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(3,"Project Title : Job Portal","Due Date : 30-12-202","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(4,"Project Title : GateSec","Due Date : 30-12-2023","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(5,"Project Title : Job Portal","Due Date : 30-12-202","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(6,"Project Title : GateSec","Due Date : 30-12-2023","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(7,"Project Title : Job Portal","Due Date : 30-12-202","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(8,"Project Title : GateSec","Due Date : 30-12-2023","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(9,"Project Title : Job Portal","Due Date : 30-12-202","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(10,"Project Title : GateSec","Due Date : 30-12-2023","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(11,"Project Title : Job Portal","Due Date : 30-12-202","Description : Help to find job for freshers only","Status : In Process"))
        Task.add(Task(12,"Project Title : GateSec","Due Date : 30-12-2023","Description : Help to find job for freshers only","Status : In Process"))

    }
}