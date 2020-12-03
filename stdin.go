package main
import (
  "fmt"
	"os"
	"bufio"
	"strings"
)
func main() {
	array := []string{}
	s := bufio.NewScanner(os.Stdin)
    for s.Scan() {
				array = append(array, s.Text())
    }
    fmt.Printf("%s\n",strings.Join(array,","))
}