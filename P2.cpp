#include <iostream>
#include <string>
using namespace std;
string reverseString(string str) {
    int left = 0;
    int right = str.length() - 1;
    
    while (left < right) {
        swap(str[left], str[right]);
        left++;
        right--;
    }

    return str;
}

int main() {
    string inputString;
    
    cout << "Enter a string: ";
    getline(cin, inputString);

    string reversedString = reverseString(inputString);
    
    cout << "Reversed string: " << reversedString << endl;

    return 0;
}
