package codeforces_800;

import java.util.*;

public class DragonsAndKirito {
    private int strengthOfKirito;
    private int countOfDragons;
    ArrayList<Dragon> dragon = new ArrayList<>();

    public static void main(String[] args) {
        DragonsAndKirito dragons = new DragonsAndKirito();
        dragons.inputData();
        System.out.println(dragons.logic());


    }

    private void inputData() {
        Scanner in = new Scanner(System.in);
        String firstLine[] = in.nextLine().split(" ");
        strengthOfKirito = Integer.parseInt(firstLine[0]);
        countOfDragons = Integer.parseInt(firstLine[1]);
        for (int i = 0; i < countOfDragons; i++) {
            Dragon dragon1 = new Dragon(in.nextLine());
            dragon.add(dragon1);
        }

    }

    private String logic() {
        Collections.sort(dragon);
        for (int i = 0; i < countOfDragons; i++) {
            if (strengthOfKirito > dragon.get(i).strengthOfDragon) {
                strengthOfKirito = strengthOfKirito + dragon.get(i).reward;
            } else return "NO";
        }
        return "YES";
    }

    class Dragon implements Comparable<Dragon> {
        int strengthOfDragon;
        int reward;

        Dragon(String lineWithElement) {
            strengthOfDragon = Integer.parseInt(lineWithElement.split(" ")[0]);
            reward = Integer.parseInt(lineWithElement.split(" ")[1]);
        }

        @Override
        public String toString() {
            return strengthOfDragon + " " + reward;
        }

        @Override
        public int compareTo(Dragon o) {
            return this.strengthOfDragon - o.strengthOfDragon;
        }
    }
}
/*
A. Драконы
ограничение по времени на тест2 секунды
ограничение по памяти на тест256 мегабайт
ввод стандартный ввод
вывод стандартный вывод
Кирито застрял на очередном уровне MMORPG, в которую он играет. Чтобы пройти игру дальше, ему нужно победить всех n
драконов, которые живут на этом уровне. Как Кирито, так и драконы обладают силой, которая выражается целым числом.
В схватке между двумя противниками исход схватки определяется их силой. Изначально сила Кирито равна s.

Если Кирито вступает в схватку с i-ым (1 ≤ i ≤ n) драконом и его сила не больше, чем сила этого дракона xi,
 то Кирито проигрывает схватку и умирает. Если же сила Кирито больше, чем сила дракона, то он побеждает дракона и
  получает бонус — его сила увеличивается на yi.

Кирито может сражаться с драконами в произвольном порядке. Определите, сможет ли он пройти на следующий уровень игры,
то есть победить всех драконов, не умирая ни разу.
 */
