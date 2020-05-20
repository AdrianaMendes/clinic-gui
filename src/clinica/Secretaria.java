package clinica;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Secretaria {
    private Paciente paciente;
    private Medico medico;

    public Secretaria() {
    }

    public void cadPaciente(Paciente p) throws IOException {
        FileWriter arq = new FileWriter("listPac.txt", true);
        BufferedWriter escritor = new BufferedWriter(arq);

        escritor.write(p.getNome());
        escritor.write(" ");
        escritor.flush();
        escritor.write(p.getCpf());
        escritor.write(" ");
        escritor.flush();
        escritor.write(p.getIdade());
        escritor.write(" ");
        escritor.flush();
        escritor.write(p.getSexo());
        escritor.write(" ");
        escritor.flush();
        escritor.write(p.getEndereco());
        escritor.write(" ");
        escritor.flush();
        escritor.write(p.getTelefone());
        escritor.write(" ");
        escritor.flush();
        escritor.write(p.getCelular());
        escritor.write(" ");
        escritor.flush();
        escritor.newLine();
        escritor.flush();

        arq.close();
    }

    public void cadMedico(Medico m) throws IOException {
        FileWriter arq = new FileWriter("listMed.txt", true);
        BufferedWriter escritor = new BufferedWriter(arq);

        escritor.write(m.getNome());
        escritor.write(" ");
        escritor.flush();
        escritor.write(m.getCrm());
        escritor.write(" ");
        escritor.flush();
        escritor.write(m.getEspecialidade());
        escritor.write(" ");
        escritor.flush();
        escritor.write(m.getEndereco());
        escritor.write(" ");
        escritor.flush();
        escritor.write(m.getTelefone());
        escritor.write(" ");
        escritor.flush();
        escritor.write(m.getCelular());
        escritor.write(" ");
        escritor.flush();
        escritor.newLine();
        escritor.flush();

        arq.close();
    }

    public void cadPlano(PlanoSaude s) throws IOException {
        FileWriter arq = new FileWriter("listPlano.txt", true);
        BufferedWriter escritor = new BufferedWriter(arq);

        escritor.write(s.getNome());
        escritor.write(" ");
        escritor.flush();
        escritor.write(s.getOperadora());
        escritor.write(" ");
        escritor.flush();
        escritor.write(s.getStatus());
        escritor.write(" ");
        escritor.flush();
        escritor.write(s.getAdesao());
        escritor.write(" ");
        escritor.flush();
        escritor.write(s.getVencimento());
        escritor.write(" ");
        escritor.flush();
        escritor.newLine();
        escritor.flush();

        arq.close();

    }

    public void excPaciente(Paciente p) throws FileNotFoundException, IOException {
        FileReader arq = new FileReader("listPac.txt");
        BufferedReader leitor = new BufferedReader(arq);
        FileWriter arq2 = new FileWriter("listPacTemp.txt");
        BufferedWriter escritor = new BufferedWriter(arq2);
        String linha;

        linha = leitor.readLine();
        while (linha != null) {
            if (linha.contains(p.getCpf())) {

            } else {
                escritor.write(linha);
                escritor.newLine();
                escritor.flush();
            }
            linha = leitor.readLine();
        }
        arq.close();
        arq2.close();
        new File("listPac.txt").delete();
        new File("listPacTemp.txt").renameTo(new File("listPac.txt"));
    }

    public void excMedico(Medico m) throws FileNotFoundException, IOException {
        FileReader arq = new FileReader("listMed.txt");
        BufferedReader leitor = new BufferedReader(arq);
        FileWriter arq2 = new FileWriter("listMedTemp.txt");
        BufferedWriter escritor = new BufferedWriter(arq2);
        String linha;

        linha = leitor.readLine();
        while (linha != null) {
            if (linha.contains(m.getCrm())) {

            } else {
                escritor.write(linha);
                escritor.newLine();
                escritor.flush();
            }
            linha = leitor.readLine();
        }
        arq.close();
        arq2.close();
        new File("listMed.txt").delete();
        new File("listMedTemp.txt").renameTo(new File("listMed.txt"));
    }

    public void excPlano(PlanoSaude s) throws FileNotFoundException, IOException {
        FileReader arq = new FileReader("listPlano.txt");
        BufferedReader leitor = new BufferedReader(arq);
        FileWriter arq2 = new FileWriter("listPlanoTemp.txt");
        BufferedWriter escritor = new BufferedWriter(arq2);
        String linha;

        linha = leitor.readLine();
        while (linha != null) {
            if (linha.contains(s.getNome()) && linha.contains(s.getOperadora())) {

            } else {
                escritor.write(linha);
                escritor.newLine();
                escritor.flush();
            }
            linha = leitor.readLine();
        }
        arq.close();
        arq2.close();
        new File("listPlano.txt").delete();
        new File("listPlanoTemp.txt").renameTo(new File("listPlano.txt"));
    }

    public void marConsulta(String medico, String paciente, String data) throws IOException {
        FileWriter arq = new FileWriter("agenda.txt", true);
        BufferedWriter escritor = new BufferedWriter(arq);

        escritor.write(medico);
        escritor.write(" ");
        escritor.flush();
        escritor.write(paciente);
        escritor.write(" ");
        escritor.flush();
        escritor.write(data);
        escritor.write(" ");
        escritor.flush();
        escritor.newLine();
        escritor.flush();

        arq.close();
    }

    public void desConsulta(String medico, String paciente, String data) throws FileNotFoundException, IOException {
        FileReader arq = new FileReader("agenda.txt");
        BufferedReader leitor = new BufferedReader(arq);
        FileWriter arq2 = new FileWriter("agendaTemp.txt");
        BufferedWriter escritor = new BufferedWriter(arq2);
        String linha;

        linha = leitor.readLine();
        while (linha != null) {
            if (linha.contains(medico) && linha.contains(paciente) && linha.contains(data)) {

            } else {
                escritor.write(linha);
                escritor.newLine();
                escritor.flush();
            }
            linha = leitor.readLine();
        }
        arq.close();
        arq2.close();
        new File("agenda.txt").delete();
        new File("agendaTemp.txt").renameTo(new File("agenda.txt"));
    }

    public boolean pesqAgenda(String medico, String data) throws FileNotFoundException, IOException {
        FileReader arq = new FileReader("agenda.txt");
        BufferedReader leitor = new BufferedReader(arq);

        boolean r = false;
        String linha;

        linha = leitor.readLine();
        while (linha != null) {
            if (linha.contains(medico) && linha.contains(data)) {
                r = true;
                break;
            }
            linha = leitor.readLine();
        }
        arq.close();
        return r;
    }

    public ArrayList listPac() throws FileNotFoundException, IOException {
        FileReader arq = new FileReader("listPac.txt");
        BufferedReader leitor = new BufferedReader(arq);

        ArrayList<String> lista = new ArrayList();
        String linha;
        String pac[] = new String[7];

        linha = leitor.readLine();
        while (linha != null) {
            pac = linha.split(" ");
            lista.add(pac[0]);
            linha = leitor.readLine();
        }
        arq.close();
        return lista;
    }
}
