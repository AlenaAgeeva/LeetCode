// Напишите функцию deepClone, которая принимает вложенный объект и возвращает его глубокую копию.
// Функция должна корректно обрабатывать массивы, объекты и примитивные значения.
// Пример:
// const original = {
//     a: 1,
//     b: [2, 3, { d: 4 }],
//     c: { e: 5 }
// };
// const clone = deepClone(original);
// console.log(clone);
// Проверка: clone.a === original.a, clone.b[2].d === original.b[2].d
// Не должно быть ссылки на оригинальный объект: clone.b !== original.b
function deepClone1(obj) {
    return structuredClone(obj);
}

function deepClone2(obj) {
    return JSON.parse(JSON.stringify(obj));
}

function deepClone3(obj) {
    if (obj === null || typeof obj !== 'object') {
        return obj;
    }
    const clone = Array.isArray(obj) ? [] : {};
    for (const key in obj) {
        clone[key] = deepClone3(obj[key]);
    }
    return clone;
}
const original = {
    name: 'John',
    age: 30,
    address: {
        city: 'New York',
        zip: '10001'
    },
    array: [1, 2, 3]
};
const clone = deepClone3(original);
console.log(clone);