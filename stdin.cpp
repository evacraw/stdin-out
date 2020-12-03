#include <iostream>
#include <vector>
using namespace std;
int main(void)
{
  string str;
  vector<string> array;
  while (std::cin)
  {
    getline(cin, str);
    array.push_back(str);
  }
  for (auto lines : array)
  {
    cout << lines << endl;
  }
  return 0;
}