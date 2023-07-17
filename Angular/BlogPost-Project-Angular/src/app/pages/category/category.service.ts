import { Injectable } from '@angular/core';
import { Category } from './category';
import { dataCategories } from 'src/assets/data/dataCategories';



@Injectable({
    providedIn: 'root'
})
export class CategoryService {
    private categories: Category[] = [];
    constructor() { }
    getCategories(): Category[] {
        return this.categories;
    }

    setCategories(): void {
        this.categories = dataCategories;
    }

    deleteCategories(id: number) {
        this.categories = this.categories.filter((category) => category.categoryId !== id);
    }

    findCategoriesById(id: Number): Category | undefined {
        return this.categories.find((category) => category.categoryId === Number(id));
    }

    addCategories(category: Category) {
        this.categories.push(category);
    }
}