package kitchenpos.menus.tobe.domain.model;

import kitchenpos.commons.tobe.domain.model.DisplayedName;

import java.util.UUID;

public class MenuGroup {

    private final UUID id;

    private final DisplayedName name;

    public MenuGroup(final UUID id, final DisplayedName name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name.value();
    }
}
