package main

import (
	"encoding/xml"
	"log"
	"os"
)

type Person struct {
	XMLName xml.Name `xml:"Person"`

	FirstName string `xml:"Name>FirstName"`
	LastName  string `xml:"Name>LastName"`

	PhoneNumbers []PhoneNumber `xml:"PhoneNumbers>PhoneNumber"`
}

type PhoneNumber struct {
	Type   string `xml:"type,attr"`
	Number string `xml:",innerxml"`
}

const SampleXML = "../sample.xml"

func main() {
	var err error
	var b []byte

	file, err := os.Open(SampleXML)

	if err != nil {
		log.Fatal(err)
	}

	defer file.Close()

	var person Person

	if err := xml.NewDecoder(file).Decode(&person); err != nil {
		log.Fatal(err)
	}

	log.Println(person)

	if b, err = xml.Marshal(person); err != nil {
		log.Fatal(err)
	}

	log.Println(string(b))
}
