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
console.log("Hello")