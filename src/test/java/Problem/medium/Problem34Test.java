package Problem.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem34Test {

    @Test
    public void testFindIndicesOfStringsStartingWithD() {
        assertEquals(Arrays.asList(1, 3), Problem34.findIndicesOfStringsStartingWithD(Arrays.asList("apple", "dog", "cat", "door")));
    }

    @Test
    public void testIsSequentiallyIncreasing() {
        assertTrue(Problem34.isSequentiallyIncreasing(Arrays.asList(1, 2, 3, 4)));
        assertFalse(Problem34.isSequentiallyIncreasing(Arrays.asList(1, 3, 2, 4)));
    }

    @Test
    public void testCapitalizeFirstLetter() {
        assertEquals(Arrays.asList("Apple", "Banana", "Cherry"), Problem34.capitalizeFirstLetter(Arrays.asList("apple", "banana", "cherry")));
    }

    @Test
    public void testFindFirstSublistWithSumOverTen() {
        assertEquals(Arrays.asList(1, 2, 3, 5), Problem34.findFirstSublistWithSumOverTen(Arrays.asList(1, 2, 3, 5, 4)));
    }

    @Test
    public void testGetNamesOfITDepartmentEmployeesOver30() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 35, "IT"),
                new Employee("Bob", 25, "IT"),
                new Employee("Charlie", 32, "HR"),
                new Employee("David", 40, "IT")
        );

        List<String> expected = Arrays.asList("Alice", "David");
        assertEquals(expected, Problem34.getNamesOfITDepartmentEmployeesOver30(employees));
    }

    @Test
    public void testGetProductNamesUnder20Dollars() {
        List<Product> products = Arrays.asList(
                new Product("Milk", 3.50),
                new Product("Bread", 2.50),
                new Product("Laptop", 500.00)
        );

        List<String> expected = Arrays.asList("Milk", "Bread");
        assertEquals(expected, Problem34.getProductNamesUnder20Dollars(products));
    }

    @Test
    public void testGetMostExpensiveProductName() {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.00),
                new Product("Smartphone", 800.00)
        );
        assertEquals("Laptop", Problem34.getMostExpensiveProductName(products));
        assertEquals("", Problem34.getMostExpensiveProductName(Collections.emptyList()));
    }
}