package pf.spring.fulboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FulbootApplication

fun main(args: Array<String>) {
	runApplication<FulbootApplication>(*args)
}
