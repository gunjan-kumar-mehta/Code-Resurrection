package main

import (
	"fmt"
	"math"
)

func main() {
	fmt.Println("Hello, Coders")
	fmt.Println(bin2Dec(1000))

}

func bin2Dec(input int) (decimal int) {
	var n int = 0
	decimal = 0
	for true {
		fmt.Println("In loop")
		if input == 0 {
			break
		} else {
			var temp int = input % 10
			decimal = decimal + temp*int(math.Pow(2, float64(n)))
			input = input / 10
		}
		n = n + 1
	}
	fmt.Println("printing things", decimal)
	return
}
