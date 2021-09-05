package kitchenpos.menus.tobe.domain;

import kitchenpos.common.tobe.DisplayedName;
import kitchenpos.common.tobe.Price;
import kitchenpos.common.tobe.Quantity;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.UUID;

public class Fixtures {

    public static MenuGroup MENU_GROUP_WITH_ALL(final UUID id, final String name) {
        return new MenuGroup(id, new DisplayedName(name));
    }

    public static MenuGroup MENU_GROUP_WITH_ID(final UUID id) {
        return MENU_GROUP_WITH_ALL(id, "추천메뉴");
    }

    public static MenuGroup MENU_GROUP_WITH_NAME(final String name) {
        return MENU_GROUP_WITH_ALL(UUID.randomUUID(), name);
    }public static Product PRODUCT_WITH_ALL(final UUID id, final BigDecimal price) {
        return new Product(id, new Price(price));
    }

    public static Product DEFAULT_PRODUCT() {
        return PRODUCT_WITH_ALL(UUID.randomUUID(), BigDecimal.valueOf(16_000L));
    }

    public static Product PRODUCT_WITH_ID(final UUID id) {
        return PRODUCT_WITH_ALL(id, BigDecimal.valueOf(16_000L));
    }

    public static Product PRODUCT_WITH_PRICE(final BigDecimal price) {
        return PRODUCT_WITH_ALL(UUID.randomUUID(), price);
    }

    public static MenuProduct MENU_PRODUCT_WITH_ALL(final Product product, final long quantity) {
        return new MenuProduct(product, new Quantity(quantity));
    }

    public static MenuProducts MENU_PRODUCTS_WITH_MENU_PRODUCT(final MenuProduct... menuProducts) {
        return new MenuProducts(Arrays.asList(menuProducts));
    }
}
