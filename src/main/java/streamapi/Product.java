package streamapi;

import java.util.Comparator;
import java.util.List;

/**
 * Вернуть top-N продуктов по рейтингу, но:
 * - учитывать только товары, у которых отзывов >= minReviews
 * - сортировать по рейтингу по убыванию
 * - при равном рейтинге сортировать по количеству отзывов по убыванию
 */
public class Product {
    private final String name;
    private final double rating; // от 0 до 5
    private final int reviews; // количество отзывов

    public Product(String name, double rating, int reviews) {
        this.name = name;
        this.rating = rating;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getReviews() {
        return reviews;
    }

    public static List<Product> topRated(List<Product> products, int n, int minReviews) {
        if (products == null || n <= 0) {
            return List.of();
        }
        return products.stream()
                .filter(p -> p.getReviews() >= minReviews)
                .sorted(Comparator.comparing(Product::getRating)
                        .reversed()
                        .thenComparing(Product::getReviews, Comparator.reverseOrder())
                        .reversed())
                .limit(n)
                .toList();
    }
}
