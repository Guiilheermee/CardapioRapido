package br.com.cardapiorapido.api;

import java.util.ArrayList;
import java.util.List;

import br.com.cardapiorapido.domain.Vehicle;

/**
 * Created by Usuário on 9/21/2017.
 */

public class MockData {
    public static List<Vehicle> getVehicles(){
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle("GRUPO AX","https://prdmovida.blob.core.windows.net/public/imagens/cars/t3_grupo_A.jpg","( Mobi Like ou similar )","R$ 50,00","Descrição Veículo"));
        list.add(new Vehicle("GRUPO B","https://prdmovida.blob.core.windows.net/public/imagens/cars/t3_grupo_B.jpg","( Gol, Novo Ka, Novo Uno, Sandero ou similar )","R$ 70,04","Descrição Veículo"));
        list.add(new Vehicle("GRUPO BX","https://prdmovida.blob.core.windows.net/public/imagens/cars/t3_grupo_BX.jpg","( HB20 - HB20S )","R$ 80,00","Descrição Veículo"));
        list.add(new Vehicle("GRUPO C","https://prdmovida.blob.core.windows.net/public/imagens/cars/t3_grupo_C.jpg","( Gol, Fox, Sandero, HB20 ou similar )","R$ 90,00","Descrição Veículo"));
        return list;
    }

}
