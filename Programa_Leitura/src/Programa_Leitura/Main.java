package Programa_Leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	
		try (Scanner in = new Scanner(System.in)) {
			String nome;
			String comando;
			Random rand = new Random();
			
			System.out.println("Bem vindo(a) ao 'jogo' insira seu nome:");
			nome = in.nextLine();
			System.out.println("Seja bem vindo(a) " + nome);
			System.out.println("Qual direção deseja ir? (w,a,s,d)");
			comando = in.nextLine();
			if (comando.equals ("w")) {
				System.out.println("Você esta indo para a frente");
				System.out.println("Um inimigo surgiu, oque deseja fazer? (a = atacar, c = correr)");
				comando = in.nextLine();
				if (comando.equals("a")) {
					if(rand.nextInt(100) < 75) {
						System.out.println("Você ganhou a luta!");
						System.out.println("oque quer fazer agora? q = se matar e= andar para frente r= ir para o proximo mapa");
						comando = in.nextLine();
						if(comando.equals("q")) {
							System.out.println("PORQUEEEE? Nem sofreu no game ainda");
							if(rand.nextInt(100) < 50) {
								System.out.println("Ninguém quer sua alma vai ficar vivo");
								System.out.println("Ainda quer morrer? q = sim e = não");
								comando = in.nextLine();
								if(comando.equals("q")) {
								if(rand.nextInt(100) < 30) {
									System.out.println("HAHAHAHAH vai ficar vivo HAHHAHAH sou muito malvadão");
									System.out.println("Ainda quer morrer? q = sim e = não");
									comando = in.nextLine();
									if(comando.equals("q")) {
										if(rand.nextInt(100) < 10) {
											System.out.println("MORRE LOGO DESGRAÇA.");
										}else {
											System.out.println("Sobe logo vai, desisto.");
										}
									}
									if(comando.equals("e")) {
										System.out.println("AGORA VAI MORRER SIM HAHAHAHAHHA");
									}
								}else {
									System.out.println("Era tão jovem :)");
									
								}
							}else {
								System.out.println("Era tão jovem : 0");
								}
								if(comando.equals("e")) {
									System.out.println("AGORA VAI MORRER SIM HAHAHAHAHHA");
								}
									
							}else {
								System.out.println("Era tão jovem : /");
							}
						}else if(comando.equals("e")) {
							System.out.println("Você caiu num buraco, reinicie o jogo : /");
						}else if(comando.equals("r")) {
							System.out.println("Você entrou no mapa 2-A");
							System.out.println("Esse mapa é territorio das chamas");
							System.out.println("A temperatura é muito alta");
						System.out.println("Você trouxe protetor solar? q = sim e = não");
						comando = in.nextLine();
						 if(comando.equals("q")) {
							 System.out.println("Mentiroso, eu sou deus taligado?");
							 System.out.println("tentou mentir pra deus né...");
							 System.out.println("AVISO: UM RAIO CAIU EM VOCÊ E AGORA ESTÁ MORTO, REINICIE O JOGO HAUAHAUAHUA...");
						 }else if(comando.equals("e")) {
							 System.out.println("Você torrou e morreu");
						 }
						}
					}else {
						System.out.println("Você perdeu a luta e acabou morrendo, reinicie o jogo : /");
					}
				}else if(comando.equals("c")) {
					if(rand.nextInt(100) < 90) {
						System.out.println("você correu e está indo para outro mapa...");
						System.out.println("Você chegou no mapa 1-C, Uma terra pacifica na maior parte do tempo");
						System.out.println("Uma garotinha esta chorando, oque vai fazer? q = ajudar  e = ignorar");
						comando = in.nextLine();
						if (comando.equals("q")) {
							System.out.println(nome + ": Por que esta chorando garotinha?");
							System.out.println("Garota: Aquele homem roubou meus doces...");
							System.out.println("Garota: Você pode me ajudar, te darei uma recompensa q = sim w = opa, que recompensa? e = não");
							comando = in.nextLine();
							if (comando.equals("q")) {
								System.out.println("Deus aprovou sua atitude");
								System.out.println("Garota: EBA!! tambom agora pegue o saco daquele homem os doces estão lá");
								if(rand.nextInt(100) < 35) {
									System.out.println("Garota: ESSE SACO NÃO!!");
									System.out.println("Deus te odeia por fazer coisas obcenas nas frente de uma garotinha");
									System.out.println("O homem te voltou um soco e você caiu desmaiado");
									System.out.println("Aviso: um raio caiu em sua região mais sensivel");
									System.out.println("Você morreu por não suportar a dor");
								}else {
									System.out.println("Homem: AI QUAL FOI MALUCO?!");
									System.out.println("Esses doces não são seus, não tire doces de criança seu maldito!!");
									System.out.println("Deus gostou de sua atitude");
									System.out.println("Homem: E?? OQUE VOCÊ VAI FAZER EIN??");
									System.out.println("oque deseja fazer? q = correr desesperadamente w = se matar e = lutar");
									comando = in.nextLine();
									if (comando.equals("q")) {
										System.out.println("Deus não gostou de sua atitude nadinha");
										System.out.println("o homem te seguiu e derrubou o saco de doces");
										System.out.println("A garotinha conseguiu seus doces de volta");
										System.out.println("Enquanto corria você tropeçou e caiu com o olho em um grande lapis que estava de pé exatamente onde você caiu e você morreu");
										System.out.println("O homem tropeçou no seu cadaver e um elefante escorreu em cima dele");
									}else if (comando.equals("w")) {
										System.out.println("Você que se matar na frente da garotinha???");
										System.out.println("Deus te odeia");
										System.out.println("Você foi teleportado para a boca de um vulcão amarrado em um espeto");
										System.out.println("Você morreu assado enquando canibais colocavam tempero no seu corpo");
									}else if (comando.equals("e")) {
										System.out.println("Deus adorou a sua escolha!");
										System.out.println("O homem sacou um revolver e atirou em sua direção");
										if(rand.nextInt(100) < 15) {
											System.out.println("O tiro te acertou mas deus teleportou você e o homem para o monte everest");
											System.out.println("Bom a garotinha não podia ver isso né?");
											System.out.println("Ambos morreram congelados");
										}else {
											System.out.println("O tiro não te acertou e fez o homem cambalear pelo ricoxete da arma");
											System.out.println("Você seguiu na direção do homem");
											System.out.println("Oque deseja fazeer? q = matar o homem com um caco de vidro e = tentar apagar o homem");
											comando = in.nextLine();
											if (comando.equals("q")) {
												System.out.println("Não na frente da menina né caraio!");
												System.out.println("Você e o homem foram mandados para saturno e morreram envenenados");
											}else if (comando.equals("e")) {
												System.out.println("Você tirou seu sapato e lançou na direção do cara");
												System.out.println("O homem desmaiou com o cheiro do seu chulé");
												System.out.println("Deus se divertiu com sua atitude HUAHAUA");
												System.out.println("Garota: Oque aconteceu com ele?");
												System.out.println(nome + ": Ele dormiu porque ficou cansado de ser um homem mau");
												System.out.println("Garota: então tabom");
												System.out.println("Você entregou o pacote de doces para a garota");
												System.out.println("Garota: Obrigado moço, agora posso comer meus doces que eu peguei da mamãe, ela sempre me disse que era um barato a hora que ela comia eles hehe!");
												System.out.println(nome + ":aaaa... bom... aproveite... mas... acho melhor você devolver para sua mãe e perguntar se são os doces certos tabom?");
												System.out.println("Garota: Ok, vou ver com a mamãe se esses são os doces dela, espero que ela não fique brava");
												System.out.println("Deus aprovou muito sua atitude");
												System.out.println("Ok, você foi uma pessoa muito honravel por isso te ofereço um milagre");
												System.out.println("hmmm... que milagre? pera, deus? é você?");
												System.out.println("Sim sou eu seu animal de teta, qual milagre fala ai");
												System.out.println("hmmm");
												System.out.println("oque deseja? q = viver pacificamente w = ser o novo deus e = ver a face de deus");
												comando = in.nextLine();
												if (comando.equals("q")) {
													System.out.println("ok eu te concedo esse milagre... prilinpinpin pacificamente até o fim!");
													System.out.println("após isso você fez toda sua aventura e incrivelmente nada aconteceu para te atrapalhar");
													System.out.println("Você achou um jarro e vendeu ele por milhões e desde então nunca mais precisou trabalhar");
													System.out.println("Você se casou com uma dama que para você era a mais bela e elegante do mundo apesar de deus discordar disso com ela toda desengonçada do jeito que era mas fazer oque é o amor né");
													System.out.println("Vocês tiveram uma vida pacifica juntos e construiram uma familia feliz e saudavel");
													System.out.println("no momento de sua morte todos que você amava estavam ao seu redor");
													System.out.println("Aviso: deus esta neste local");
													System.out.println("você foi uma pessoa horanvel caro amigo, sinto muito por ter uma vida tão curta como humano, por isso essa vai ser sua segunda chance");
													System.out.println("Você recebeu uma chance de renascer");
													System.out.println("Você morreu, pode tentar novamente");
												}else if (comando.equals("w")) {
													System.out.println("Nossa!! Por essa eu não esperava, mas beleza");
													System.out.println("Esse é o codigo do universo");
													System.out.println("https://github.com/JiukOn/Game_oUniversoN-oTeQuer");
													System.out.println("Aviso: Você é deus e o antigo deus sumiu");
													System.out.println("você não pode mais morrer...");
												}else if (comando.equals("e")) {
													System.out.println("Beleza, mas isso será doloroso");
													System.out.println("Essa é a face de deus: https://linktr.ee/jiukon");
													System.out.println("Você morreu pois a face de deus é bela demais para um simples mortal");
												}
											}
										}
									}
								}
							}else if (comando.equals("w")) {
								System.out.println("COMO ASSIM TU TA PEDINDO QUAL A RECOMPENSA PARA ESSA LINDA GAROTINHA, RENASÇA E FAÇA OQUE ELA PEDIR SEM PENSAR NA PRÓXIMA VEZ");
								System.out.println("Você virou presunto");
							}else if (comando.equals("e")) {
								System.out.println("não vo quero nem saber mais só morre");
								System.out.println("Aviso: deus te odeia muito");
								System.out.println("Aviso: um furacão surgiu com você no centro e você foi jogado a 30 metros de altura");
								System.out.println("Você morreu de queda e seu cadaver parece uma pomba atropelada");
							}
							
						}else if (comando.equals("e")) {
						   if(rand.nextInt(100) < 5) {
							   System.out.println("O universo não gostou da sua atitude e você foi atingido por um raio,e faleceu, AJUDA A MININA SEU VAGABUNDO");
						   }else {
							   System.out.println("você IGNOROU a GAROTINHAZINHA KAWAII ONII-CHAN com INFELIZMENTE sucesso...");
							   System.out.println("agora oque o VAGABUNDO(a) do(a) " + nome + "quer fazer agora?");
							   System.out.println("q = se matar e = luta contra 500 inimigos e leva um raio");
							   comando = in.nextLine();
							   if(comando.equals("q")) {
								   System.out.println("com prazer...");
							   }else if(comando.equals("e")) {
								   if(rand.nextInt(100) < 20) {
									   System.out.println("Você lutou contra 500 e sobreviveu, ainda por cima sobreviveu a um raio divino nessa vida meu deus");
									   System.out.println("Agora deus te odeia você deseja continuar a aventura? q = morte dolorosa e sangrenta ou e = uma aventura nivel master god hard");
									   comando = in.nextLine();
									   if(comando.equals("q")) {
										   System.out.println("Deus agradeça sua falta de vida... ; )");
									   }else if(comando.equals("e")) {
										   System.out.println(" Namoral eu ia te deixar morrer só com umas mordida de porco mas agora tu vai sofrer...");
										   System.out.println(" Aviso: um vulcão surgiu do seu lado e uma bomba atômica está caindo em sua direção");
										   if(rand.nextInt(100) < 70) {
											   System.out.println(" Você perdeu sua perna");   	
											   if(rand.nextInt(100) < 70) {
												   System.out.println(" Você perdeu seus braços");   
												   if(rand.nextInt(100) < 70) {
													   System.out.println(" Você perdeu duas fatias de nadegas");   										   
												   }
											   }
											   System.out.println(" Você está sangrando lentamente e imaginando como sua vida seria se tivesse ajudado a garotinha");  
											   System.out.println("Seu egoísmo te matou... ou não?");
											   System.out.println("Deseja voltar no tempo? q = sim e = não"); 
											   comando = in.nextLine();
											   if(comando.equals("q")) {
												   System.out.println("EU TAMBÉM OTARIO AGORA MORRE AI TROXÃO NA PRÓXIMA MUDA DE ATITUDE AI"); 
												   System.out.println("Aviso: você morreu lentamente e com muita dor gritando no meio de um beco com ratos dançando ao seu redor com a musica aui mauê, ou foi uma alucinção e na verdade eles estavam comendo sua carne não tenho certeza"); 
											   }else if(comando.equals("e")) {
												   System.out.println("que bom que escolheu essa opção, ia ser mo humilhação se você falasse sim, só por isso vou te matar mais rapido"); 
												   System.out.println("você morreu mais rapido seu vagabundo odiado por deus"); 
											   }
										   }else {
											   System.out.println("Ta, não sei como você sobreviveu a isso mas agora chega");
											   System.out.println("Aviso: Deus encarnou em um cão extremamente gordo e te desceu o cacete (entenda como quiser)");
											   System.out.println("humilhado(a) e derrotado(a) você se matou");
											   System.out.println("Deus cagou no seu cadaver e te reviveu com a bosta divina");
											   System.out.println("TUA VIDA É TÃO RUIM QUE A BOSTA DE UM CACHORRO TE REVIVE OTARIO(a)");
											   System.out.println("Deus te mandou para marte com um chute depois mijou em você e te jogou no sol");
											   System.out.println("Você estava prestes a perder o ar e ficar sem consciencia quando sentiu que estava congelando e derrepente começou a pegar fogo e se tornar cinzas no espaço");
											   System.out.println("Aviso: você virou poeira espacial misturada com xixi de cachorro gordo divino");
									   }
									   }
								   }else {
									   System.out.println("você incrivelmente só morreu mesmo tchau, criatura patetica");
								   }
							   }
						   }
						}
					}else {
						System.out.println("O inimigo te atacou pelas costas e você morreu, reinicie o jogo...");
					}
				}
			} else if(comando.equals("a")) {
				System.out.println("Você esta indo para a esquerda");
				System.out.println("Você deu de cara com um ork KKKKKK que azarado(a)");
				System.out.println("Oque você quer fazer?");
				System.out.println("q = lutar com o ork w = fugir e= se matar r= pedir para deus te ajudar");
				comando = in.nextLine();
				if(comando.equals("q")) {
					System.out.println("Tu achou msm que poderia ganhar de um ork??" + nome + ",TU É DOIDO(a) ATÉ EU TENHO MEDO DE ORK");
					System.out.println("Morreu...");
					System.out.println("Era tão jovem :/");
				}else if(comando.equals("w")) {
					System.out.println("Tu não fugiu não cara...");
					System.out.println("Aviso: você deu três passos e o ork arrancou sua cabeça");
				}else if(comando.equals("e")) {
					System.out.println("Tente a sorte no céu, essa é a unica versão onde você não vai pro inferno");
					System.out.println("Você morreu");
				}else if(comando.equals("r")) {
					System.out.println("MAS QUE OUSADIA É ESSA?");
					System.out.println("vo ajuda não morre ai tenho medo de ork");
					System.out.println("Aviso: o ork achou que você era uma garota ork e...");
					System.out.println("Aviso: seu anus explodiu e você morreu de sangramento");
					System.out.println("Por isso tenho medo de orks parecem completos animais, nem pra agradecer a deus antes da refeição HAHAHAH");
				}
			}else if( comando.equals("s")){
				System.out.println("Você esta indo para trás");
			}else if(comando.equals("d")) {
				System.out.println("Você esta indo para a direita");
			}
		}
		
	
	
	}
	

}
