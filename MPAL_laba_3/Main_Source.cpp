#include<iostream>
#include<vector>
#include <thread>
#include<algorithm>
#include"Sort.h"
using namespace std;

int main() {
	setlocale(LC_ALL, "ru");
	cout << "Введите число: ";
	int n;
	cin >> n;

	sortArray array;
	vector<int> vectorCopy;
	vector<int> vectorCopy1;
	vector<int> vectorCopy2;

	for (int i = n; i >= 0; i--) {
		vectorCopy.push_back(i);
		vectorCopy1.push_back(i);
		vectorCopy2.push_back(i);
	}

	vector<int> arraySort;
	map<int, int> mapSort;

	auto t1 = chrono::high_resolution_clock::now();
	arraySort = array.count_sort(vectorCopy,0,vectorCopy.size());
	auto t2 = chrono::high_resolution_clock::now();
	auto seconds = chrono::duration<double>(t2 - t1).count();
	cout << "Время работы программы vector: " << seconds << " sec." << endl;

	auto t4 = chrono::high_resolution_clock::now();
	mapSort = array.count_sort_map(vectorCopy1, 0, vectorCopy1.size());
	auto t3 = chrono::high_resolution_clock::now();
	auto seconds1 = chrono::duration<double>(t3 - t4).count();
	cout << "Время работы программы std::map: " << seconds1 << " sec." << endl;

	auto t5 = chrono::high_resolution_clock::now();
	sort(vectorCopy2.begin(),vectorCopy2.end());
	auto t6 = chrono::high_resolution_clock::now();
	auto seconds2 = chrono::duration<double>(t6 - t5).count();
	cout << "Время работы программы std::sort: " << seconds2 << " sec." << endl;

	return 1;
}