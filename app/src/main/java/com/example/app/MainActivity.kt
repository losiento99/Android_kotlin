package com.example.app

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //监听按钮的点击事件
        // loginBtn.setOnClickListener(this)
//
//
//
        /**
        loginBtn.setOnClickListener(object :View.OnClickListener{
        override fun onClick(p0: View?) {
        println("2按钮被点击了")
        }
        })
        }
         */
//        loginBtn.setOnClickListener({view:View? ->
//            println("3按钮被点击了")
//        })
//

//        loginBtn.setOnClickListener{view:View? ->
//            println("4按钮被点击了")
//        }

//        loginBtn.setOnClickListener{
//            println("5按钮被点击了")
//        }

        loginBtn.setOnClickListener{
            //apply,also with
            /**
             *also
             */
            /**
            ObjectAnimator.ofFloat(mHeader,"roration",0f,360f).also {
                it.duration=100
                it.repeatCount=20
                it.start()
                it.addListener(object :Animator.AnimatorListener{
                    override fun onAnimationRepeat(p0: Animator?) {

                    }

                    override fun onAnimationEnd(p0: Animator?) {
                        //添加旋转动画 跳转界面
                        startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                    }

                    override fun onAnimationCancel(p0: Animator?) {

                    }

                    override fun onAnimationStart(p0: Animator?) {

                    }
                })
            }


          */
            //apply直接在对象内部使用代码块 可以访问这个对象的本身的属性和方法
            ObjectAnimator.ofFloat(mHeader,"roration",0f,360f).apply {
                duration =100
                repeatCount=6
                start()
                addListener(object :MyAnimatorlistener(){
                    override fun onAnimationEnd(po:Animator?) {
                       startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                    }
                })
//                addListener(object :Animator.AnimatorListener{
//                    override fun onAnimationRepeat(p0: Animator?) {
//
//                    }
//
//                    override fun onAnimationEnd(p0: Animator?) {
//                        //添加旋转动画 跳转界面
//                        startActivity(Intent(this@MainActivity,DetailActivity::class.java))
//                    }
//
//                    override fun onAnimationCancel(p0: Animator?) {
//
//                    }
//
//                    override fun onAnimationStart(p0: Animator?) {
//
//                    }
//                })
            }


            /**
           //添加 动画
            //旋转 平移 缩放 透明度
          val anim=  ObjectAnimator.ofFloat(mHeader,"roration",0f,360f)
            anim.duration=100
            anim.repeatCount=20
            anim.start()
            //监听动画的结束时间
            anim.addListener(object :Animator.AnimatorListener{
                override fun onAnimationRepeat(p0: Animator?) {

                }

                override fun onAnimationEnd(p0: Animator?) {
                    //添加旋转动画 跳转界面
                    startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                }

                override fun onAnimationCancel(p0: Animator?) {

                }

                override fun onAnimationStart(p0: Animator?) {

                }
            })


             */
        }

 }



    override fun onClick(p0: View?) {
        println("1按钮被点击了")
    }
}