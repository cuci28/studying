package main

import "fmt"

func main() {
	fmt.Println("Я мейн я запустился!")
	defer func() {
		fmt.Println("Я мейн я закончился!")
	} ()
}

