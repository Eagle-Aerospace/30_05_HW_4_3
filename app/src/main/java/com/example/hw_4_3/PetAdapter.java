package com.example.hw_4_3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.ViewHolder> {

    //поля адаптера
    private final LayoutInflater inflater;
    private final List<Pet> pets;

    //конструктор для адаптера
    public PetAdapter(Context context, List<Pet> pets) {
        this.inflater = LayoutInflater.from(context);
        this.pets = pets;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Animal
    @NonNull
    @Override
    public PetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Animal по определенной позиции
    @Override
    public void onBindViewHolder(PetAdapter.ViewHolder holder, int position) {
        Pet pet = pets.get(position);
        holder.petView.setImageResource(pet.getPetResourse());
        holder.nameView.setText(pet.getName());
        holder.petDescriptionView.setText(pet.getPetDescription());
        holder.habitatView.setText(pet.getHabitat());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return pets.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView petView;
        final TextView nameView, petDescriptionView, habitatView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        public ViewHolder(@NonNull View view) {
            super(view);
            petView = view.findViewById(R.id.petResource);
            nameView = view.findViewById(R.id.petName);
            petDescriptionView = view.findViewById(R.id.petDescription);
            habitatView = view.findViewById(R.id.petHabitat);
        }
    }
}
