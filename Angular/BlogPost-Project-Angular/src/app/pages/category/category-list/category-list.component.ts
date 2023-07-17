import { Component } from '@angular/core';
import { Category } from '../category';
import { CategoryService } from '../category.service';

@Component({
    selector: 'app-category-list',
    templateUrl: './category-list.component.html',
    styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent {
    categories: Category[] = [];
    editMode: boolean = false;

    category: Category = {
        categoryId: 0,
        name: "",
        creationDate: ""
    }

    constructor(private categoryService: CategoryService) {
        this.categoryService.setCategories();
        this.categories = this.categoryService.getCategories();
    }

    handleCategoryEdit(id: number) {
        this.category = this.categories.find((category) => category.categoryId === id)!;
        this.editMode = true;
    }

    handleCategoryDelete(id: number) {
        this.categoryService.deleteCategories(id);
        this.categories = this.categoryService.getCategories();
    }

    handleSaveEdit(id: number) {
        const categoryToEdit = this.categories.find((category) => category.categoryId === id);
        categoryToEdit!.name = this.category.name;
        categoryToEdit!.creationDate = this.category.creationDate;
        this.editMode = false;
    }

    handleCancelEdit() {
        this.editMode = false;
    }
}