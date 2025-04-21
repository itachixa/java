#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cout << "Enter value for a: ";
    cin >> a;
    cout << "Enter value for b: ";
    cin >> b;
    cout << "Enter value for c: ";
    cin >> c;

    int result1 = a + b * c;
    int result2 = a * b + c;
    int result3 = c + a / b;
    int result4 = a % b + c;

    cout << "The results of Int Operations are " << result1 << ", "
         << result2 << ", " << result3 << ", and " << result4 << endl;

    return 0;
}
