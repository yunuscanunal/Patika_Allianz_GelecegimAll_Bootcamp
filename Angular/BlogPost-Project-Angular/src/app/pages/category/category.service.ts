import { Injectable } from '@angular/core';
import { Category } from './category';
import { dataCategories } from 'src/assets/data/dataCategories';
import { PostService } from '../post/post.service';

@Injectable({
    providedIn: 'root'
})
export class CategoryService {
    private categories: Category[] = [];

    constructor(private postService: PostService) { }

    getCategories(): Category[] {
        return this.categories;
    }

    setCategories(): void {
        this.categories = dataCategories;
    }

    deleteCategory($event: number) {
        if (this.postService.getPosts().length === 0)
            this.postService.setPosts();
        if (this.postService.getPosts().filter(post => Number(post.categoryId) === Number($event)).length > 0)
            alert("You cannot delete a category with posts");
        else
            this.categories = this.categories.filter(category => category.categoryId !== $event);
    }

    getCategoryById(id: number): Category | undefined {
        return this.categories.find((category) => category.categoryId === id);
    }

    updateCategory(updateCategory: Category) {
        this.categories = this.categories.map(category => {
            if (category.categoryId === updateCategory.categoryId)
                category = updateCategory;
            return category;
        });
    }

    addCategory(newName: string, newDate: string) {
        const newCategory: Category = {
            categoryId: this.getCategories()[this.getCategories().length - 1].categoryId + 1,
            name: newName,
            creationDate: newDate,
        }
        if (this.checkUniqueCategory(newCategory.name, newCategory.categoryId) === true)
            this.categories.push(newCategory);
        else
            alert("This category already exist");
    }

    findCategoryByName(name: string) {
        return this.categories.find((category) => category.name === name)
    }

    checkUniqueCategory(name: string, id: number): boolean {
        if (this.categories.find((category) => category.name === name.toLowerCase()) !== undefined
            && this.findCategoryByName(name.toLowerCase())!.categoryId !== id)
            return false;
        else
            return true;
    }
}