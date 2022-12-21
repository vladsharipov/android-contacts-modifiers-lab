package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
class SortUiState {

    // сделайте поля isApplyEnable и newSelectedSortType приватными
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    public boolean getIsApplyEnable() {
        return isApplyEnable;
    }

    public String getNewSelectedSortType() {
        return newSelectedSortType;
    }

    public void setIsApplyEnable(boolean isApplyEnable) {
        this.isApplyEnable = isApplyEnable;
    }
    public void setNewSelectedSortType(String newSelectedSortType){
        this.newSelectedSortType = newSelectedSortType;
    }
    // реализуйте get и set методы для обоих полей
}
