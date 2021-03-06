package com.cv4j.netdiscovery.example

import com.cv4j.netdiscovery.core.pipeline.ConsolePipeline
import com.cv4j.netdiscovery.dsl.spider


/**
 * Created by tony on 2018/5/27.
 */
object TestDSL4Spider {

    @JvmStatic
    fun main(args: Array<String>) {

        val spider = spider {

            name = "tony"

            urls = listOf("http://www.163.com/","https://www.baidu.com/")

            pipelines = setOf(ConsolePipeline())
        }

        spider.run()
    }

}